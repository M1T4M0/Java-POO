class Calificacion:
    def __init__(self, nombre, nota: float):
        self.nombre = nombre
        self.nota = nota


class Estudiante:
    def __init__(self, nombre):
        self.nombre = nombre
        self.listaNotas = []  # lista dinámica

    # 1.agregar_calificacion() añade al final, pero RECHAZA duplicados
    def agregar_calificacion(self, nombre, nota):
        nombre_norm = nombre.strip().lower()
        # si ya existe una actividad con ese nombre, no agrega
        if any(c.nombre.strip().lower() == nombre_norm for c in self.listaNotas):
            print(f"Ya existe la actividad '{nombre}'. No se agrega duplicado.")
            return

        if 0 <= nota <= 100:
            self.listaNotas.append(Calificacion(nombre.strip(), nota))
            print(f"Calificación '{nombre}' con nota {nota} agregada.")
        else:
            print("La nota debe estar entre 0 y 100.")

    # 2.eliminar_calificacion() por actividad (afecta la primera coincidencia)
    def eliminar_calificacion(self, nombre):
        nombre_norm = nombre.strip().lower()
        for c in self.listaNotas:
            if c.nombre.strip().lower() == nombre_norm:
                self.listaNotas.remove(c)
                print(f"Calificación '{nombre}' eliminada.")
                return
        print(f"No se encontró la calificación '{nombre}'.")

    # 3.modificar_calificacion() por actividad (afecta la primera coincidencia)
    def modificar_calificacion(self, nombre, nueva_nota):
        nombre_norm = nombre.strip().lower()
        for c in self.listaNotas:
            if c.nombre.strip().lower() == nombre_norm:
                if 0 <= nueva_nota <= 100:
                    c.nota = nueva_nota
                    print(f"Nota de '{nombre}' actualizada a {nueva_nota}.")
                else:
                    print("La nueva nota debe estar entre 0 y 100.")
                return
        print(f"No se encontró la calificación '{nombre}' para modificar.")

    # 4.calcular_promedio() retorna 0 si está vacía
    def calcular_promedio(self):
        if not self.listaNotas:
            return 0
        return sum(c.nota for c in self.listaNotas) / len(self.listaNotas)

    # 5mostrar_calificaciones() recorre e imprime
    def mostrar_calificaciones(self):
        if not self.listaNotas:
            print("No hay calificaciones registradas.")
        else:
            print(f"\nCalificaciones de {self.nombre}:")
            for c in self.listaNotas:
                print(f"- {c.nombre}: {c.nota:.2f}")


# Programa principal
if __name__ == "__main__":
    nombre = input("Ingrese el nombre del estudiante: ")
    estudiante = Estudiante(nombre)

    while True:
        print("\nPrograma de Notas")
        print("1. Agregar calificación")
        print("2. Eliminar calificación")
        print("3. Modificar calificación")
        print("4. Calcular promedio")
        print("5. Mostrar calificaciones")
        print("6. Salir")

        seleccion = input("Seleccione una opción: ").strip()

        if seleccion == "1":
            actividad = input("Nombre de la actividad: ").strip()
            try:
                nota = float(input("Nota (0 - 100): ").replace(",", "."))
            except ValueError:
                print("Nota inválida.")
                continue
            estudiante.agregar_calificacion(actividad, nota)

        elif seleccion == "2":
            actividad = input("Nombre de la actividad a eliminar: ").strip()
            estudiante.eliminar_calificacion(actividad)

        elif seleccion == "3":
            actividad = input("Nombre de la actividad a modificar: ").strip()
            try:
                nota = float(input("Nueva nota (0 - 100): ").replace(",", "."))
            except ValueError:
                print("Nota inválida.")
                continue
            estudiante.modificar_calificacion(actividad, nota)

        elif seleccion == "4":
            promedio = estudiante.calcular_promedio()
            print(f"Promedio: {promedio:.2f}")

        elif seleccion == "5":
            estudiante.mostrar_calificaciones()

        elif seleccion == "6":
            print("Fin del programa.")
            break

        else:
            print("Opción inválida.")

