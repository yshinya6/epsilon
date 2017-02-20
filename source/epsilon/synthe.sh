for x in {1..9}; do
  java -jar synthesizer.jar mark -Dsize=${x}00.0 > ${x}00k.epsilon
done

#for x in {1..10}; do
#  java -jar synthesizer.jar mark -Dsize=${x}0.0 > ${x}0k.epsilon
#done
