(ns exercises.012-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= 3 (first '(3 2 1))))
    (is (= 3 (second [2 3 4])))
    (is (= 3 (last (list 1 2 3))))))

;; https://www.4clojure.com/problem/12
;; All Clojure collections support sequencing. You can operate on sequences
;; with functions like first, second, and last.
