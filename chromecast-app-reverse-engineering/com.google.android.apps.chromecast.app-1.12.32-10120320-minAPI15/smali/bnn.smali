.class final Lbnn;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Latu;

.field private synthetic c:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Ljava/lang/String;Latu;)V
    .locals 0

    .prologue
    .line 750
    iput-object p1, p0, Lbnn;->c:Lbmu;

    iput-object p2, p0, Lbnn;->a:Ljava/lang/String;

    iput-object p3, p0, Lbnn;->b:Latu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 753
    iget-object v0, p0, Lbnn;->a:Ljava/lang/String;

    .line 754
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v0, v2}, Lasr;->a(Ljava/lang/String;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 755
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 756
    iget-object v0, p0, Lbnn;->b:Latu;

    .line 1293
    iget-object v0, v0, Latu;->e:Ldbw;

    .line 757
    invoke-static {}, Lape;->a()Lape;

    move-result-object v2

    new-instance v3, Lapd;

    const/16 v4, 0x40

    if-nez v0, :cond_0

    move v0, v1

    .line 759
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lapd;-><init>(ILjava/lang/Integer;)V

    .line 757
    invoke-virtual {v2, v3}, Lape;->a(Lapd;)V

    .line 760
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v2, p0, Lbnn;->a:Ljava/lang/String;

    aput-object v2, v0, v1

    .line 761
    return-void

    .line 2173
    :cond_0
    iget v0, v0, Ldbw;->b:I

    goto :goto_0
.end method
