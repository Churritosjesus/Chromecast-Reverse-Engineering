.class final Lew;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lfa;


# instance fields
.field private synthetic a:Ler;


# direct methods
.method constructor <init>(Lev;Ler;)V
    .locals 0

    .prologue
    .line 219
    iput-object p2, p0, Lew;->a:Ler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 260
    invoke-static {p1}, Ler;->a(Landroid/view/View;)Ljn;

    move-result-object v0

    .line 262
    if-eqz v0, :cond_0

    .line 1169
    iget-object v0, v0, Ljn;->a:Ljava/lang/Object;

    .line 262
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 250
    invoke-static {p1, p2}, Ler;->a(Landroid/view/View;I)V

    .line 251
    return-void
.end method

.method public final a(Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 233
    iget-object v0, p0, Lew;->a:Ler;

    new-instance v1, Ljd;

    invoke-direct {v1, p2}, Ljd;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Ler;->a(Landroid/view/View;Ljd;)V

    .line 235
    return-void
.end method

.method public final a(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 1

    .prologue
    .line 267
    iget-object v0, p0, Lew;->a:Ler;

    invoke-virtual {v0, p1, p2, p3}, Ler;->a(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result v0

    return v0
.end method

.method public final a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .prologue
    .line 223
    iget-object v0, p0, Lew;->a:Ler;

    invoke-virtual {v0, p1, p2}, Ler;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    return v0
.end method

.method public final a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .prologue
    .line 245
    iget-object v0, p0, Lew;->a:Ler;

    invoke-virtual {v0, p1, p2, p3}, Ler;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    return v0
.end method

.method public final b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lew;->a:Ler;

    invoke-virtual {v0, p1, p2}, Ler;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 229
    return-void
.end method

.method public final c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .prologue
    .line 239
    invoke-static {p1, p2}, Ler;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 240
    return-void
.end method

.method public final d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .prologue
    .line 255
    invoke-static {p1, p2}, Ler;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 256
    return-void
.end method
