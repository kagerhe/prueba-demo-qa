# Automatización de Pruebas DEMOQA

## Descripción

Este exámen tiene como objetivo la automatización de pruebas para una aplicación web utilizando Selenium WebDriver con Java. El proyecto incluye pruebas para la interacción con elementos de la página, web tablas, botones, check box, radio button y más. Utiliza Cucumber para la definición de escenarios y la ejecución de pruebas BDD (Behavior Driven Development).

## Estructura del Proyecto
src/test/java: Contiene las clases de implementación del proyecto.
pages: Clases que representan las páginas de la aplicación y sus elementos.
utility: Clases auxiliares, como el controlador del navegador.
stepDefinition: Clases que definen los pasos para las pruebas de Cucumber.
features: Describen los escenarios de prueba en lenguaje Gherkin.
pom.xml: Archivo de configuración de Maven que define las dependencias del proyecto.

### Paquetes

- **pages**: Contiene las páginas de la aplicación con sus métodos asociados.
  - `ButtonPage.java`: Métodos para interactuar con los botones.
  - `WebTablesPage.java`: Métodos para interactuar con las tablas web.
  - `CheckBoxPage.java`: Métodos para interactuar con los check de la aplicación.
  - `RadioButtonPage.java`: Métodos para interactuar con los botones de la aplciación.
  - `TextBoxPage.java`: Métodos para interactuar con los campos de textos de un formulario.

- **stepDefinition**: Define los pasos para Cucumber.
  - `ButtonsSteps.java`: Pasos para las interacciones con los botones.
  - `WebTablesSteps.java`: Pasos para las interacciones con las tablas web.
  - `CheckBoxSteps.java`: Pasos para las interacciones con los check box.
  - `RadioButtonSteps.java`: Pasos para las interacciones con los radio button.
  - `TextBoxSteps.java`:Pasos para las interacciones con laos campos de texto.

- **utility**: Utilidades para el manejo del navegador y configuraciones.
  - `BrowserDriver.java`: Configuración del WebDriver.
  - `Hooks.java`: Configuración y cierre de pruebas.
- **features**: Archivos de características para Cucumber en formato `.feature`.

## Instalación y Configuración

1. Clonar este Repositorio

   ```bash
   git clone https://github.com/kagerhe/prueba-demo-qa.git
   ```

2. Instalar las dependencias del proyecto


```bash
mvn install
```

3. Configurar el WebDriver
Descarga el WebDriver correspondiente a tu navegador desde la siguiente ruta: https://googlechromelabs.github.io/chrome-for-testing/#stable  
El proyecto se probó usando la versión: `128.0.6613.137 (r1331488)` y en específico el siguiente:

| Binary       | Plataform | URL                                                                                                    |
|--------------|------------|--------------------------------------------------------------------------------------------------------|
| chromedriver | win64      | [https://storage.googleapis.com/chrome-for-testing-public/128.0.6613.137/win64/chromedriver-win64.zip](https://storage.googleapis.com/chrome-for-testing-public/128.0.6613.137/win64/chromedriver-win64.zip) |

Descomprime el archivo descargado, busca dentro el archivo ejecutable `chromedriver.exe`


Ahora copia este fichero en la ruta `src\test\resources\driver` dentro del proyecto.

4. Ejecución del proyecto
Para ejecutar las pruebas, utiliza el siguiente comando Maven:

```bash
mvn test
```


