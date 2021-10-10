package Application;

import OperationsBin.BinToDec;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String number;
		int baseOut;
		int baseInput;
		float result;

		// Menu selection input base.
		System.out.print("\n 1 Decimal \n 2 Octal \n 3 Binário \n 4 Hexadecimal\nEscolha a base de entrada: ");
		baseInput =  input.nextInt();

		// To input Decimal
		if (baseInput == 1) {
			System.out.print("\nDigite um número Decimal: ");
			number = input.next();

			//Input data verification

			// Menu selection output base.
			System.out.print("\n 1 Octal \n 2 Binário \n 3 Hexadecimal \nEscolha a base de saída: ");
			baseOut = input.nextInt();

			// Output verification
			if(baseOut == 1) {
				System.out.print("\nO número decimal "+number+" convertido em octal é: \n" );
			} else if(baseOut == 2) {
				System.out.print("\nO número decimal "+number+" convertido em binário é: \n" );
			} else if(baseOut == 3) {
				System.out.print("\nO número decimal "+number+" convertido em hexadecimal é: \n" );
			}
		}
		// To input Octal
		else if (baseInput == 2) {
			System.out.print("\nDigite um número octal: ");
			number = input.next();

			//Input data verification

			// Menu selection output base.
			System.out.print("\n 1 Decimal \n 2 Binário \n 3 Hexadecimal\nEscolha a base de saída: ");
			baseOut = input.nextInt();

			// Output verification
			if(baseOut == 1) {
				System.out.print("\nO número octal "+number+" convertido em decimal é: \n" );
			} else if(baseOut == 2) {
				System.out.print("\nO número octal "+number+" convertido em binário é: \n" );
			} else if(baseOut == 3) {
				System.out.print("\nO número octal "+number+" convertido em hexadecimal é: \n" );
			}
		}
		// To input Binário
		else if (baseInput == 3) {
			System.out.print("\nDigite um número binário: ");
			number = input.next();

			//Input data verification

			// Menu selection output base.
			System.out.print("\n 1 Octal \n 2 Decimal \n 3 Hexadecimal\nEscolha a base de saída: ");
			baseOut = input.nextInt();

			// Output verification
			if(baseOut == 1) {
				System.out.print("\nO número binário "+number+" convertido em Octal é:" );
			} else if(baseOut == 2) {
				BinToDec binToDec = new BinToDec();
				binToDec.setEntradaBinDec(number);
				System.out.print("\nO número binário "+number+" convertido em Decimal é:" + BinToDec.conversionBinDec(number));
			} else if(baseOut == 3) {
				System.out.print("\nO número binário "+number+" convertido em hexadecimal é: \n" );
			}
		}
		// To input Hexadecimal
		else if (baseInput == 4) {
			System.out.print("\nDigite um número hexadecimal: ");
			number = input.next();

			//Input data verification

			// Menu selection output base.
			System.out.print("\n 1 Octal \n 2 Decimal \n 3 Binário\nEscolha a base de saída: ");
			baseOut = input.nextInt();

			// Output verification
			if(baseOut == 1) {
				System.out.print("\nO número hexadecimal "+number+" convertido em Octal é: \n" );
			} else if(baseOut == 2) {
				System.out.print("\nO número hexadecimal "+number+" convertido em Decimal é: \n" );
			} else if(baseOut == 3) {
				System.out.print("\nO número hexadecimal "+number+" convertido em hexadecimal é: \n" );
			}
		}
	}
	}

