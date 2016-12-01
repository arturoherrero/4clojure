(ns exercises.016-4clojure-test
  (:require [clojure.test :refer :all]))

(deftest exercise-test
  (testing
    (is (= ((fn [name] (str "Hello, " name "!")) "Dave") "Hello, Dave!"))
    (is (= ((fn [name] (str "Hello, " name "!")) "Jenn") "Hello, Jenn!"))
    (is (= ((fn [name] (str "Hello, " name "!")) "Rhea") "Hello, Rhea!"))))

;; https://www.4clojure.com/problem/16
;; Write a function which returns a personalized greeting.
