public class LightBoard
{
  /** The lights on the board, where true represents on and false represents off.
   */
  private boolean[][] lights;
  private int Rows, Cols;
  private int random;
  /** Constructs a LightBoard object having numRows rows and numCols columns.
   * Precondition: numRows > 0, numCols > 0
   * Postcondition: each light has a 40% probability of being set to on.
   */
  public LightBoard(int numRows, int numCols)
  {
    /* to be implemented in part (a) */
    Rows = numRows;
    Cols = numCols;
    random = (int)(Math.random()*101);
         for (int r = 0;r<Rows;r++){
           for(int c=0;c<Cols;c++){
        if(random > 60 ){
        lights[r][c] = false;
        random = (int)(Math.random()*101);
        }else {
          lights[r][c] = true;
          random = (int)(Math.random()*101);
        }
}
}
  }

  /** Evaluates a light in row index row and column index col and returns a status
   *  as described in part (b).
   *  Precondition: row and col are valid indexes in lights.
   */
  public boolean evaluateLight(int row, int col)
  {
    /* to be implemented in part (b) */
      if(lights[row][col] == true){
return true;
      }else 
        return false;

  }
  public boolean[][] getLights()
  {
    return lights;
  }
  //used for testing
  public String toString()
  {
    String s = "";
    for (int r = 0; r < lights.length; r++)
    {
      for (int c = 0; c < lights[0].length; c++)
        if (lights[r][c])
          s += "*";
        else
          s += ".";
      s += "\n";
    }
    return s;
  }
  
}
