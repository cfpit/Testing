import sys

def main():
    # sys.argv[0] es el nombre del script
    # sys.argv[1:] son los argumentos pasados al script
    if len(sys.argv) < 3:
        print("Ingrese dos números!")
    else:
        try:
            resultado = int(sys.argv[1]) + int(sys.argv[2])
            print(resultado)
        except ValueError:
            print("Error: Los parámetros deben ser números enteros")

if __name__ == "__main__":
    main()