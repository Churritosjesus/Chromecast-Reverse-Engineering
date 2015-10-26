.class final Lawp;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# direct methods
.method constructor <init>(Lawn;)V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 76
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 77
    check-cast v0, Laou;

    sget-object v1, Lana;->c:Lana;

    invoke-interface {v0, v1}, Laou;->a(Lana;)V

    .line 78
    return-void
.end method
