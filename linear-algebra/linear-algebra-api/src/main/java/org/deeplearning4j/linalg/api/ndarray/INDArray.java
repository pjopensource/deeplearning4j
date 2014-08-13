package org.deeplearning4j.linalg.api.ndarray;

/**
 * Interface for an ndarray
 *
 * @author Adam Gibson
 */
public interface INDArray {


    /**
     * Replicate and tile array to fill out to the given shape
     * @param shape the new shape of this ndarray
     * @return the shape to fill out to
     */
    public INDArray repmat(int[] shape);

    /**
     * Insert a row in to this array
     * Will throw an exception if this
     * ndarray is not a matrix
     * @param row the row insert into
     * @param toPut the row to insert
     * @return this
     */
    public INDArray putRow(int row,INDArray toPut);

    /**
     * Insert a column in to this array
     * Will throw an exception if this
     * ndarray is not a matrix
     * @param column the column to insert
     * @param toPut the array to put
     * @return this
     */
    public INDArray putColumn(int column,INDArray toPut);

    /**
     * Returns the element at the specified row/column
     * This will throw an exception if the
     * @param row the row of the element to return
     * @param column the row of the element to return

     * @return a scalar indarray of the element at this index
     */
    public INDArray getScalar(int row,int column);

    /**
     * Returns the element at the specified index
     * @param i the index of the element to return
     * @return a scalar ndarray of the element at this index
     */
    public INDArray getScalar(int i);



    /**
     * Inserts the element at the specified index
     * @param i the index insert into
     * @param element a scalar ndarray
     * @return a scalar ndarray of the element at this index
     */
    public INDArray put(int i,INDArray element);


    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    public INDArray diviColumnVector(INDArray columnVector);
    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    public INDArray divColumnVector(INDArray columnVector);

    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    public INDArray diviRowVector(INDArray rowVector);
    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    public INDArray divRowVector(INDArray rowVector);


    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    public INDArray muliColumnVector(INDArray columnVector);
    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    public INDArray mulColumnVector(INDArray columnVector);

    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    public INDArray muliRowVector(INDArray rowVector);
    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    public INDArray mulRowVector(INDArray rowVector);




    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    public INDArray subiColumnVector(INDArray columnVector);
    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    public INDArray subColumnVector(INDArray columnVector);

    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    public INDArray subiRowVector(INDArray rowVector);
    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    public INDArray subRowVector(INDArray rowVector);

    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    public INDArray addiColumnVector(INDArray columnVector);
    /**
     * In place addition of a column vector
     * @param columnVector the column vector to add
     * @return the result of the addition
     */
    public INDArray addColumnVector(INDArray columnVector);

    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    public INDArray addiRowVector(INDArray rowVector);
    /**
     * In place addition of a column vector
     * @param rowVector the column vector to add
     * @return the result of the addition
     */
    public INDArray addRowVector(INDArray rowVector);

    /**
     * Perform a copy matrix multiplication
     * @param other the other matrix to perform matrix multiply with
     * @return the result of the matrix multiplication
     */
    public INDArray mmul(INDArray other);


    /**
     * Perform an copy matrix multiplication
     * @param other the other matrix to perform matrix multiply with
     * @param result the result ndarray
     * @return the result of the matrix multiplication
     */
    public INDArray mmul(INDArray other,INDArray result);


    /**
     * in place (element wise) division of two matrices
     * @param other the second ndarray to divide
     * @return the result of the divide
     */
    public INDArray div(INDArray other);

    /**
     * copy (element wise) division of two matrices
     * @param other the second ndarray to divide
     * @param result the result ndarray
     * @return the result of the divide
     */
    public INDArray div(INDArray other,INDArray result);


    /**
     * copy (element wise) multiplication of two matrices
     * @param other the second ndarray to multiply
     * @return the result of the addition
     */
    public INDArray mul(INDArray other);

    /**
     * copy (element wise) multiplication of two matrices
     * @param other the second ndarray to multiply
     * @param result the result ndarray
     * @return the result of the multiplication
     */
    public INDArray mul(INDArray other,INDArray result);

    /**
     * copy subtraction of two matrices
     * @param other the second ndarray to subtract
     * @return the result of the addition
     */
    public INDArray sub(INDArray other);

    /**
     * copy subtraction of two matrices
     * @param other the second ndarray to subtract
     * @param result the result ndarray
     * @return the result of the subtraction
     */
    public INDArray sub(INDArray other,INDArray result);

    /**
     * copy addition of two matrices
     * @param other the second ndarray to add
     * @return the result of the addition
     */
    public INDArray add(INDArray other);

    /**
     * copy addition of two matrices
     * @param other the second ndarray to add
     * @param result the result ndarray
     * @return the result of the addition
     */
    public INDArray add(INDArray other,INDArray result);










    /**
     * Perform an copy matrix multiplication
     * @param other the other matrix to perform matrix multiply with
     * @return the result of the matrix multiplication
     */
    public INDArray mmuli(INDArray other);


    /**
     * Perform an copy matrix multiplication
     * @param other the other matrix to perform matrix multiply with
     * @param result the result ndarray
     * @return the result of the matrix multiplication
     */
    public INDArray mmuli(INDArray other,INDArray result);


    /**
     * in place (element wise) division of two matrices
     * @param other the second ndarray to divide
     * @return the result of the divide
     */
    public INDArray divi(INDArray other);

    /**
     * in place (element wise) division of two matrices
     * @param other the second ndarray to divide
     * @param result the result ndarray
     * @return the result of the divide
     */
    public INDArray divi(INDArray other,INDArray result);


    /**
     * in place (element wise) multiplication of two matrices
     * @param other the second ndarray to multiply
     * @return the result of the addition
     */
    public INDArray muli(INDArray other);

    /**
     * in place (element wise) multiplication of two matrices
     * @param other the second ndarray to multiply
     * @param result the result ndarray
     * @return the result of the multiplication
     */
    public INDArray muli(INDArray other,INDArray result);

    /**
     * in place subtraction of two matrices
     * @param other the second ndarray to subtract
     * @return the result of the addition
     */
    public INDArray subi(INDArray other);

    /**
     * in place subtraction of two matrices
     * @param other the second ndarray to subtract
     * @param result the result ndarray
     * @return the result of the subtraction
     */
    public INDArray subi(INDArray other,INDArray result);

    /**
     * in place addition of two matrices
     * @param other the second ndarray to add
     * @return the result of the addition
     */
    public INDArray addi(INDArray other);

    /**
     * in place addition of two matrices
     * @param other the second ndarray to add
     * @param result the result ndarray
     * @return the result of the addition
     */
    public INDArray addi(INDArray other,INDArray result);


    /**
     * Returns the normmax along the specified dimension
     * @param dimension  the dimension to getScalar the norm1 along
     * @return the norm1 along the specified dimension
     */
    public INDArray normmax(int dimension);




    /**
     * Returns the norm2 along the specified dimension
     * @param dimension  the dimension to getScalar the norm2 along
     * @return the norm2 along the specified dimension
     */
    public INDArray norm2(int dimension);


    /**
     * Returns the norm1 along the specified dimension
     * @param dimension  the dimension to getScalar the norm1 along
     * @return the norm1 along the specified dimension
     */
    public INDArray norm1(int dimension);



    /**
     * Returns the product along a given dimension
     * @param dimension the dimension to getScalar the product along
     * @return the product along the specified dimension
     */
    public INDArray prod(int dimension);


    /**
     * Returns the overall mean of this ndarray
     * @param dimension the dimension to getScalar the mean along
     * @return the mean along the specified dimension of this ndarray
     */
    public INDArray mean(int dimension);

    /**
     * Returns the sum along the last dimension of this ndarray
     * @param dimension  the dimension to getScalar the sum along
     * @return the sum along the specified dimension of this ndarray
     */
    public INDArray sum(int dimension);





    /**
     * Returns the elements at the the specified indices
     * @param indices the indices to getScalar
     * @return the array with the specified elements
     */
    public INDArray get(int[] indices);


    /**
     * Return a copy of this ndarray
     * @return a copy of this ndarray
     */
    public INDArray dup();


    /**
     * Returns a flattened version (row vector) of this ndarray
     * @return a flattened version (row vector) of this ndarray
     */
    public INDArray ravel();


    /**
     * Returns the number of slices in this ndarray
     * @return the number of slices in this ndarray
     */
    public int slices();


    /**
     * Returns the specified slice of this ndarray
     * @param i the index of the slice to return
     * @param dimension the dimension to return the slice for
     * @return the specified slice of this ndarray
     */
    public INDArray slice(int i,int dimension);


    /**
     * Returns the specified slice of this ndarray
     * @param i the index of the slice to return
     * @return the specified slice of this ndarray
     */
    public INDArray slice(int i);


    /**
     * Returns the start of where the ndarray is
     * for the underlying data
     * @return the starting offset
     */
    public int offset();

    /**
     * Reshapes the ndarray (can't change the length of the ndarray)
     * @param newShape the new shape of the ndarray
     * @return the reshaped ndarray
     */
    public INDArray reshape(int[] newShape);

    /**
     * Flip the rows and columns of a matrix
     * @return the flipped rows and columns of a matrix
     */
    public INDArray transpose();

    /**
     * Mainly here for people coming from numpy.
     * This is equivalent to a call to permute
     * @param dimension the dimension to swap
     * @param with the one to swap it with
     * @return the swapped axes view
     */
    public INDArray swapAxes(int dimension,int with);

    /**
     * See: http://www.mathworks.com/help/matlab/ref/permute.html
     * @param rearrange the dimensions to swap to
     * @return the newly permuted array
     */
    public INDArray permute(int[] rearrange);


    /**
     * Returns the specified column.
     * Throws an exception if its not a matrix
     * @param i the column to getScalar
     * @return the specified column
     */
    INDArray getColumn(int i);

    /**
     * Returns the specified row.
     * Throws an exception if its not a matrix
     * @param i the row to getScalar
     * @return the specified row
     */
    INDArray getRow(int i);

    /**
     * Returns the number of columns in this matrix (throws exception if not 2d)
     * @return the number of columns in this matrix
     */
    int columns();

    /**
     * Returns the number of rows in this matrix (throws exception if not 2d)
     * @return the number of rows in this matrix
     */
    int rows();

    /**
     * Returns true if the number of columns is 1
     * @return true if the number of columns is 1
     */
    boolean isColumnVector();
    /**
     * Returns true if the number of rows is 1
     * @return true if the number of rows is 1
     */
    boolean isRowVector();

    /**
     * Returns true if this ndarray is a vector
     * @return whether this ndarray is a vector
     */
    boolean isVector();

    /**
     * Returns true if this ndarray is a matrix
     * @return whether this ndarray is a matrix
     */
    boolean isMatrix();

    /**
     * Returns true if this ndarray is a scalar
     * @return whether this ndarray is a scalar
     */
    boolean isScalar();


    /**
     * Returns the shape of this ndarray
     * @return the shape of this ndarray
     */
    int[] shape();


    /**
     * Returns the stride of this ndarray
     * @return the stride of this ndarray
     */
    int[] stride();

    /**
     * Returns the size along a specified dimension
     * @param dimension the dimension to return the size for
     * @return the size of the array along the specified dimension
     */
    int size(int dimension);

    /**
     * Returns the total number of elements in the ndarray
     * @return the number of elements in the ndarray
     */
    int length();



    /**
     * Broadcasts this ndarray to be the specified shape
     * @param shape the new shape of this ndarray
     * @return the broadcasted ndarray
     */
    INDArray broadcast(int[] shape);

    /**
     * Broadcasts this ndarray to be the specified shape
     * @param shape the new shape of this ndarray
     * @return the broadcasted ndarray
     */
    INDArray broadcasti(int[] shape);


    /**
     * Returns a scalar (individual element)
     * of a scalar ndarray
     * @return the individual item in this ndarray
     */
    Object element();

    /**
     * Returns a linear double array representation of this ndarray
     * @return the linear double array representation of this ndarray
     */
    public double[] data();

    /**
     * Returns a linear float array representation of this ndarray
     * @return the linear float array representation of this ndarray
     */
    public float[] floatData();
}