(ns exercises.022-4clojure-test
  (:require [clojure.test :refer :all]))

(defn my-count
  ([collection] (my-count collection 0))
  ([collection counter]
   (if (empty? collection)
     counter
     (my-count (rest collection) (inc counter)))))

(deftest exercise-test
  (testing
    (is (= (my-count '(1 2 3 3 1)) 5))
    (is (= (my-count "Hello World") 11))
    (is (= (my-count [[1 2] [3 4] [5 6]]) 3))
    (is (= (my-count '(13)) 1))
    (is (= (my-count '(:a :b :c)) 3))))

;; https://www.4clojure.com/problem/22
;; Write a function which returns the total number of elements in a sequence.
