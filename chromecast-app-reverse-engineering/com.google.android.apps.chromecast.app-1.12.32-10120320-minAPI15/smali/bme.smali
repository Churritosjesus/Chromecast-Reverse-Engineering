.class final Lbme;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:Ljava/lang/String;

.field private synthetic c:Lapd;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lapd;)V
    .locals 0

    .prologue
    .line 686
    iput-object p1, p0, Lbme;->a:Ljava/lang/String;

    iput-object p2, p0, Lbme;->b:Ljava/lang/String;

    iput-object p3, p0, Lbme;->c:Lapd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 689
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lbme;->a:Ljava/lang/String;

    iget-object v2, p0, Lbme;->b:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lblx;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 690
    iget-object v0, p0, Lbme;->c:Lapd;

    if-eqz v0, :cond_0

    .line 691
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    iget-object v1, p0, Lbme;->c:Lapd;

    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 693
    :cond_0
    return-void
.end method
