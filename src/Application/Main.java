package Application;

import OperationsBin.BinToDec;
import OperationsDec.DecToBin;
import OperationsDec.DecToHex;
import OperationsDec.DecToOct;
import OperationsHex.HexToDec;
import OperationsOct.OctToDec;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = 0;
		String numberHexa = null;
		int baseOut = 0;
		int baseInput = 0;
		float result;

		// Menu selection input base.
		System.out.print("\n 1 Decimal \n 2 Octal \n 3 Binário \n 4 Hexadecimal\nEscolha a base de entrada: ");

		// Input data verification
		try {
			baseInput =  input.nextInt();
			boolean verify = Integer.toString(baseInput).matches("-?[1-4]{1,1}+");
			if (verify == false){
				throw new Exception();
			}
		} catch (Exception err) {
			System.out.print("Opção inválida");
			System.exit(0);
		}

		// To input Decimal
		if (baseInput == 1) {
			System.out.print("\nDigite um número Decimal: ");

			// Input data verification
			try {
				number = input.nextInt();
				boolean verify = Integer.toString(number).matches("-?[0-9]{1,}+");
				if (verify == false){
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("Não foi inserido um número na base Decimal");
				System.exit(0);
			}

			// Menu selection output base.
			System.out.print("\n 1 Octal \n 2 Binário \n 3 Hexadecimal \nEscolha a base de saída: ");

			// Option Output verification
			try {
				baseOut = input.nextInt();
				boolean verify = Integer.toString(baseOut).matches("-?[1-3]{1,1}+");
				if (verify == false){
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("Opção inválida");
				System.exit(0);
			}

			// Print conversion on screen
			if(baseOut == 1) {
				DecToOct decToOct = new DecToOct();
				System.out.print("\nO número decimal "+number+" convertido em octal é: \n" +decToOct.conversionDecOct(number));
			} else if(baseOut == 2) {
				DecToBin decToBin = new DecToBin();
				System.out.print("\nO número decimal "+number+" convertido em binário é: \n" + decToBin.conversionDecBin(number));
			} else if(baseOut == 3) {
				DecToHex decToHex = new DecToHex();
				System.out.print("\nO número decimal "+number+" convertido em hexadecimal é: \n" + decToHex.conversionDecHex(number));
			}
		}
		// To input Octal
		else if (baseInput == 2) {
			System.out.print("\nDigite um número octal: ");

			// Input data verification
			try {
				number = input.nextInt();
				boolean verify = Integer.toString(number).matches("-?[0-7]{1,}+");
				if (verify == false){
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("Não foi inserido um número na base Octal");
				System.exit(0);
			}

			// Menu selection output base.
			System.out.print("\n 1 Decimal \n 2 Binário \n 3 Hexadecimal\nEscolha a base de saída: ");

			// Option Output verification
			try {
				baseOut = input.nextInt();
				boolean verify = Integer.toString(baseOut).matches("-?[1-3]{1,1}+");
				if (verify == false){
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("Opção inválida");
				System.exit(0);
			}

			// Print conversion on screen
			OctToDec octToDec = new OctToDec();
			if(baseOut == 1) {
				System.out.print("\nO número octal "+number+" convertido em decimal é: \n" + octToDec.conversionOctDec(number));
			} else if(baseOut == 2) {
				DecToBin decToBin = new DecToBin();
				System.out.print("\nO número octal "+number+" convertido em binário é: \n" + decToBin.conversionDecBin(octToDec.conversionOctDec(number)));
			} else if(baseOut == 3) {
				DecToHex decToHex= new DecToHex();
				System.out.print("\nO número octal "+number+" convertido em hexadecimal é: \n" +decToHex.conversionDecHex(octToDec.conversionOctDec(number)));
			}
		}
		// To input Binário
		else if (baseInput == 3) {
			System.out.print("\nDigite um número binário: ");

			// Input data verification
			try {
				number = input.nextInt();
				boolean verify = Integer.toString(number).matches("-?[0-1]{1,}+");
				if (verify == false){
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("Não foi inserido um número na base Binária");
				System.exit(0);
			}

			// Menu selection output base.
			System.out.print("\n 1 Octal \n 2 Decimal \n 3 Hexadecimal\nEscolha a base de saída: ");

			// Option Output verification
			try {
				baseOut = input.nextInt();
				boolean verify = Integer.toString(baseOut).matches("-?[1-3]{1,1}+");
				if (verify == false){
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("Opção inválida");
				System.exit(0);
			}

			// Print conversion on screen
			BinToDec binToDec = new BinToDec();
			if(baseOut == 1) {
				DecToOct decToOct = new DecToOct();
				System.out.print("\nO número binário "+number+" convertido em Octal é: \n" +decToOct.conversionDecOct(binToDec.conversionBinDec(number)));
			} else if(baseOut == 2) {
				System.out.print("\nO número binário "+number+" convertido em Decimal é: \n" +binToDec.conversionBinDec(number));
			} else if(baseOut == 3) {
				DecToHex decToHex = new DecToHex();
				System.out.print("\nO número binário "+number+" convertido em hexadecimal é: \n" +decToHex.conversionDecHex(binToDec.conversionBinDec(number)));
			}
		}
		// To input Hexadecimal
		else if (baseInput == 4) {
			System.out.print("\nDigite um número hexadecimal: ");

			// Input data verification
			try {
				numberHexa = input.next();
				boolean verify = numberHexa.matches("-?[0-9a-fA-F]+");
				if (verify == false){
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("Não foi inserido um número na base Hexadecimal");
				System.exit(0);
			}

			// Menu selection output base.
			System.out.print("\n 1 Octal \n 2 Decimal \n 3 Binário\nEscolha a base de saída: ");

			// Option Output verification
			try {
				baseOut = input.nextInt();
				boolean verify = Integer.toString(baseOut).matches("-?[1-3]{1,1}+");
				if (verify == false){
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("Opção inválida");
				System.exit(0);
			}

			// Print conversion on screen
			HexToDec hexToDec = new HexToDec();
			if(baseOut == 1) {
				DecToOct decToOct = new DecToOct();
				System.out.print("\nO número hexadecimal "+numberHexa+" convertido em Octal é: \n" +decToOct.conversionDecOct(hexToDec.conversionHexDec(numberHexa)));
			} else if(baseOut == 2) {
				System.out.print("\nO número hexadecimal "+numberHexa+" convertido em Decimal é: \n" + hexToDec.conversionHexDec(numberHexa));
			} else if(baseOut == 3) {
				DecToBin decToBin = new DecToBin();
				System.out.print("\nO número hexadecimal "+numberHexa+" convertido em binário é: \n" + decToBin.conversionDecBin(hexToDec.conversionHexDec(numberHexa)));

			}
		}
	}
}

