.class final Lbno;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lbmu;


# direct methods
.method constructor <init>(Lbmu;)V
    .locals 0

    .prologue
    .line 792
    iput-object p1, p0, Lbno;->a:Lbmu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 795
    iget-object v0, p0, Lbno;->a:Lbmu;

    .line 1069
    iget-object v0, v0, Lbmu;->f:Lbbn;

    .line 795
    if-eqz v0, :cond_0

    .line 796
    iget-object v0, p0, Lbno;->a:Lbmu;

    .line 2069
    iget-object v0, v0, Lbmu;->f:Lbbn;

    .line 796
    invoke-virtual {v0}, Lbbn;->c()V

    .line 798
    :cond_0
    return-void
.end method
