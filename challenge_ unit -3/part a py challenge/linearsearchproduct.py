"""
kyftryuh
"""

def linearSearchproduct(productList , targetProduct):
  indices = []

  for index , product in enumerate(productList):
   if product == targetProduct:
     indices .append(index)

     return indices

#Example usage:
products = ["shoes" , "boot" , "loafer" , "shoes" , "sandal" , "shoes"]
target = "sandal"
result = linearSearchproduct(products, target)
print(result)
