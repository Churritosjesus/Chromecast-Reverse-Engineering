.class final Let;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ley;


# instance fields
.field private synthetic a:Ler;


# direct methods
.method constructor <init>(Les;Ler;)V
    .locals 0

    .prologue
    .line 128
    iput-object p2, p0, Let;->a:Ler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 159
    invoke-static {p1, p2}, Ler;->a(Landroid/view/View;I)V

    .line 160
    return-void
.end method

.method public final a(Landroid/view/View;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 142
    iget-object v0, p0, Let;->a:Ler;

    new-instance v1, Ljd;

    invoke-direct {v1, p2}, Ljd;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1, v1}, Ler;->a(Landroid/view/View;Ljd;)V

    .line 144
    return-void
.end method

.method public final a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .prologue
    .line 132
    iget-object v0, p0, Let;->a:Ler;

    invoke-virtual {v0, p1, p2}, Ler;->b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    return v0
.end method

.method public final a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Let;->a:Ler;

    invoke-virtual {v0, p1, p2, p3}, Ler;->a(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v0

    return v0
.end method

.method public final b(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Let;->a:Ler;

    invoke-virtual {v0, p1, p2}, Ler;->d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 138
    return-void
.end method

.method public final c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .prologue
    .line 148
    invoke-static {p1, p2}, Ler;->c(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 149
    return-void
.end method

.method public final d(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 0

    .prologue
    .line 164
    invoke-static {p1, p2}, Ler;->a(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 165
    return-void
.end method
