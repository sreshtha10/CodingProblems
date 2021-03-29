read -r a
read -r b
sum=`expr $a + $b`
sub=`expr $a - $b`
div=`expr $a / $b`
mul=`expr $a \* $b`
echo $sum 
echo $sub
echo $mul 
echo $div 

