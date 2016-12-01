(ns exercises.023-4clojure-test
  (:require [clojure.test :refer :all]))

(defn my-reverse [collection]
  (if (empty? collection)
    []
    (conj (my-reverse (rest collection)) (first collection))))

(deftest exercise-test
  (testing
    (is (= (my-reverse [1 2 3 4 5]) [5 4 3 2 1]))
    (is (= (my-reverse (sorted-set 5 7 2 7)) '(7 5 2)))
    (is (= (my-reverse [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]]))))

;; https://www.4clojure.com/problem/23
;; Write a function which reverses a sequence.
