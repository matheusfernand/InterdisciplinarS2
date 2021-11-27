package Application;

import java.util.Scanner;

public class Main {



	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = 0;
		String numberHexa;
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

			if(baseOut == 1) {
				System.out.print("\nO número binário "+number+" convertido em Octal é: \n" );
			} else if(baseOut == 2) {
//				int numberw = Integer.getInteger(number);
//				BinToDec tested = new BinToDec(numberw);
//				tested.calculadorCientifica(tested);
			} else if(baseOut == 3) {
				System.out.print("\nO número binário "+number+" convertido em hexadecimal é: \n" );
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

