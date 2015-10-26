.class final Layb;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# direct methods
.method constructor <init>(Laxy;)V
    .locals 0

    .prologue
    .line 103
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 106
    const/16 v0, 0x79

    .line 107
    invoke-static {v0}, Lapg;->a(I)Lapg;

    move-result-object v0

    .line 108
    invoke-virtual {v0}, Lapg;->b()V

    .line 109
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 110
    check-cast v0, Laou;

    sget-object v1, Lana;->c:Lana;

    invoke-interface {v0, v1}, Laou;->a(Lana;)V

    .line 111
    return-void
.end method
