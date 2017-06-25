### 需求描述1
用户可以可以使用Mile为单位的长度可以进行比较是否相等

- 当以Mile为单位来表示一个长度时,精度为1 Mile，例如：
  ```
   3 Mile == 3 Mile
   3 Mile != 2 Mile
  ```

### 需求描述2
用户可以可以使用Mile为单位的长度不仅可以进行比较是否相等，还可以进行相加

- 当以Mile为单位来表示一个长度时,精度为1 Mile，能够将两个长度相加，例如：
  ```
   5 Mile = 1 Mile + 4 Mile
  ```

### 需求描述3
用户除了可以使用Mile为单位来表示长度之外，还可以使用Yard为单位来表示长度，其中:

- 当以Mile为单位来表示一个长度时,精度为1 Mile
- 当以Yard为单位来表示一个长度时,精度为1 Yard
- 能够对比任意两个长度的相等性
- 能够将任意的长度进行相加
  ```
   1 Mile == 1760 Yard
   3 Yard == 3 Yard
   1 Mile != 1761 Yard
   3 Yard != 4 Yard
   3 Yard = 1 Yard + 2 Yard
   1762 Yard = 1 Mile + 2 Yard
  ```

### 需求描述4
用户可以可以使用Feet为单位的长度不仅可以进行比较是否相等，还可以进行相加

- 当以Feet为单位来表示一个长度时,精度为1 Feet，能够将两个长度相加，例如：
  ```
   3 Feet == 3 Feet
   5 Feet = 1 Feet + 4 Feet
   1 Yard == 3 Feet
  ```

### 需求描述5
用户可以可以使用Inch为单位的长度不仅可以进行比较是否相等，还可以进行相加

- 当以Inch为单位来表示一个长度时,精度为1 Inch，能够将两个长度相加，例如：
  ```
   3 Inch == 3 Inch
   5 Inch = 1 Inch + 4 Inch
   1 Feet == 12 Inch
   15 Inch = 1 Feet + 3 Inch
  ```

### 需求描述6
用户只能使用上述几种长度单位(Mile、Yard、Feet、Inch)，而不应创建新的单位，避免产生奇怪而不存在的单位