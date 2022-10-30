
(ns window.tab)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn open-tab!
  ; @param (string) uri
  ;
  ; @usage
  ;  (open-tab! "www.my-site.com/my-link")
  [uri]
  (.open js/window uri "_blank"))

(defn reload-tab!
  ; @usage
  ;  (reload-tab!)
  [_]
  (.reload js/window.location true))
