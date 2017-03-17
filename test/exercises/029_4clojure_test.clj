(ns exercises.029-4clojure-test
  (:require [clojure.test :refer :all]))

(defn keep-upper-case [string]
  (clojure.string/join
    (filter #(Character/isUpperCase %) string)))

(deftest exercise-test
  (testing
    (is (= (keep-upper-case "HeLlO, WoRlD!") "HLOWRD"))
    (is (empty? (keep-upper-case "nothing")))
    (is (= (keep-upper-case "$#A(*&987Zf") "AZ"))))

;; https://www.4clojure.com/problem/29
;; Write a function which takes a string and returns a new string containing only the capital letters.
