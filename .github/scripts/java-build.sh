find . -name "*.java" -exec sh -c '
rc=0
for file do
  javac -d ./bin -sourcepath ./src "$file" || rc=$?
done
exit $rc
' sh {} \;
