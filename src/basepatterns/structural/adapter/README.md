**Adapter pattern** works as a bridge between two incompatible interfaces.
In our example we have `client-class VectorGraphicsRunner`, wich can work only with `interface VectorGraphicsInterface`.
And we have class RasterGraphics with methods.
To adapt  RasterGraphics to VectorGraphicsInterface we can use 2 way:
   *   **1st way** - by using inheritance --> extends `class RasterGraphics`
   * **2nd way** - by using composition --> put `instance of class RasterGraphics` into class FromRasterToVectorAdapter2   