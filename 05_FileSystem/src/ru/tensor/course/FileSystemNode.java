package ru.tensor.course;

public interface FileSystemNode {

    // Возвращает родительский элемент.
    public FileSystemNode getParent();

    // Возвращает имя.
    public String getName();

    // Возвращает путь.
    public String getPath();
}
