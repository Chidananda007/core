package core.core;

import core.core.dto.Entity;
import core.core.dto.SubjectDetailResponse;
import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import static java.util.concurrent.Executors.*;

@RequiredArgsConstructor
public class CoreApplication {
	
	private static final CoreApplication coreApplication = new CoreApplication();

	private static final Random random = new Random();

	public static void main(String[] args) {

		try {
			for (int i = 0;i<=100;i++) {
				System.out.println(getPasscode());
			}
		}catch (Exception e){
			System.out.println("Error :");
		}
	}

	public static String getRandomNumber(int digCount) {
		StringBuilder sb = new StringBuilder(digCount);
		IntStream.range(0, digCount).forEach(s -> sb.append(random.nextInt(10)));
		return String.valueOf(sb);
	}

	private static  Long getPasscode() throws Exception {
		var passcode = getRandomNumber(6);
		if (passcode.length() == 6) {
			return Long.parseLong(passcode);
		}
		return getPasscode();
	}
}
