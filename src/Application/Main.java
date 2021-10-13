package Application;

import OperationsBin.BinToDec;
import OperationsDec.DecToOct;
import OperationsHex.HexToDec;
import OperationsOct.OctToDec;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String number;
		int numberI;
		int baseOut;
		int baseInput;
		float result;

		// Menu selection input base.
		System.out.print("\n 1 Decimal \n 2 Octal \n 3 Binário \n 4 Hexadecimal\nEscolha a base de entrada: ");
		baseInput =  input.nextInt();

		// To input Decimal
		if (baseInput == 1) {
			System.out.print("\nDigite um número Decimal: ");
			numberI = input.nextInt();

			//Input data verification

			// Menu selection output base.
			System.out.print("\n 1 Octal \n 2 Binário \n 3 Hexadecimal \nEscolha a base de saída: ");
			baseOut = input.nextInt();

			// Output verification
			if(baseOut == 1) {
				DecToOct decToOct = new DecToOct();
				decToOct.setEntradaDecToOct(numberI);
				System.out.print("\nO número decimal "+numberI+" convertido em octal é: "+decToOct.conversionDecOct());
			} else if(baseOut == 2) {
				System.out.print("\nO número decimal "+numberI+" convertido em binário é: \n" );
			} else if(baseOut == 3) {
				System.out.print("\nO número decimal "+numberI+" convertido em hexadecimal é: \n" );
			}
		}
		// To input Octal
		else if (baseInput == 2) {
			System.out.print("\nDigite um número octal: ");
			numberI = input.nextInt();

			//Input data verification

			// Menu selection output base.
			System.out.print("\n 1 Decimal \n 2 Binário \n 3 Hexadecimal\nEscolha a base de saída: ");
			baseOut = input.nextInt();

			// Output verification
			if(baseOut == 1) {
				OctToDec octToDec = new OctToDec();
				octToDec.setEntradaOctToDec(numberI);

				System.out.print("\nO número octal "+numberI+" convertido em decimal é: " + octToDec.conversionOctDec(numberI));
			} else if(baseOut == 2) {
				System.out.print("\nO número octal "+numberI+" convertido em binário é: \n" );
			} else if(baseOut == 3) {
				System.out.print("\nO número octal "+numberI+" convertido em hexadecimal é: \n" );
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
				HexToDec hexToDec = new HexToDec();
				hexToDec.setEntradaHexToDec(number);
				System.out.print("\nO número hexadecimal " + number + " convertido em Decimal é: " + hexToDec.conversionHexDec(number));
			} else if(baseOut == 3) {
				System.out.print("\nO número hexadecimal "+number+" convertido em hexadecimal é: \n" );
			}
		}
	}
	}

