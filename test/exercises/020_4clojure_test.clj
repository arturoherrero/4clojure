(ns exercises.020-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= (#(second (reverse %)) (list 1 2 3 4 5)) 4))
    (is (= (#(second (reverse %)) ["a" "b" "c"]) "b"))
    (is (= (= (#(second (reverse %)) [[1 2] [3 4]]) [1 2])))))

;; https://www.4clojure.com/problem/20
;; Write a function which returns the second to last element from a sequence.
