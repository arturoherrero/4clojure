(ns exercises.015-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= ((fn [num] (* num 2)) 2) 4))
    (is (= ((fn [num] (* num 2)) 3) 6))
    (is (= ((fn [num] (* num 2)) 11) 22))
    (is (= ((fn [num] (* num 2)) 7) 14))))

;; https://www.4clojure.com/problem/15
;; Write a function which doubles a number.
