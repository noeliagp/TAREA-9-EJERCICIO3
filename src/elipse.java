

/**
 * Class elipse
 */
public class elipse {

  //
  // Fields
  //

  private float eje_mayor;
  private float eje_menor;
  private String color;
  
  //
  // Constructors
  //
  public elipse (float eje_mayor,float eje_menor,String color) {
    eje_mayor = this.eje_mayor;
    eje_menor = this.eje_menor;
    color = this.color;
  };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of eje_mayor
   * @param newVar the new value of eje_mayor
   */
  public void setEje_mayor (float newVar) {
    eje_mayor = newVar;
  }

  /**
   * Get the value of eje_mayor
   * @return the value of eje_mayor
   */
  public float getEje_mayor () {
    return eje_mayor;
  }

  /**
   * Set the value of eje_menor
   * @param newVar the new value of eje_menor
   */
  public void setEje_menor (float newVar) {
    eje_menor = newVar;
  }

  /**
   * Get the value of eje_menor
   * @return the value of eje_menor
   */
  public float getEje_menor () {
    return eje_menor;
  }

  /**
   * Set the value of color
   * @param newVar the new value of color
   */
  public void setColor (String newVar) {
    color = newVar;
  }

  /**
   * Get the value of color
   * @return the value of color
   */
  public String getColor () {
    return color;
  }

  //
  // Other methods
  //

}
