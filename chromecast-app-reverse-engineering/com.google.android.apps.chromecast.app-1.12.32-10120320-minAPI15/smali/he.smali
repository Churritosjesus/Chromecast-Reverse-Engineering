.class public final Lhe;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnApplyWindowInsetsListener;


# instance fields
.field private synthetic a:Lgm;


# direct methods
.method public constructor <init>(Lgm;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lhe;->a:Lgm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 2

    .prologue
    .line 60
    new-instance v0, Liy;

    invoke-direct {v0, p2}, Liy;-><init>(Landroid/view/WindowInsets;)V

    .line 62
    iget-object v1, p0, Lhe;->a:Lgm;

    invoke-interface {v1, p1, v0}, Lgm;->a(Landroid/view/View;Lix;)Lix;

    move-result-object v0

    check-cast v0, Liy;

    .line 1116
    iget-object v0, v0, Liy;->a:Landroid/view/WindowInsets;

    .line 64
    return-object v0
.end method
