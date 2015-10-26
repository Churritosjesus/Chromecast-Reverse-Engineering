.class final Lnq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lgm;


# instance fields
.field private synthetic a:Lno;


# direct methods
.method constructor <init>(Lno;)V
    .locals 0

    .prologue
    .line 331
    iput-object p1, p0, Lnq;->a:Lno;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Lix;)Lix;
    .locals 4

    .prologue
    .line 335
    invoke-virtual {p2}, Lix;->b()I

    move-result v0

    .line 336
    iget-object v1, p0, Lnq;->a:Lno;

    invoke-static {v1, v0}, Lno;->b(Lno;I)I

    move-result v1

    .line 338
    if-eq v0, v1, :cond_0

    .line 339
    invoke-virtual {p2}, Lix;->a()I

    move-result v0

    invoke-virtual {p2}, Lix;->c()I

    move-result v2

    invoke-virtual {p2}, Lix;->d()I

    move-result v3

    invoke-virtual {p2, v0, v1, v2, v3}, Lix;->a(IIII)Lix;

    move-result-object p2

    .line 347
    :cond_0
    invoke-static {p1, p2}, Lgt;->a(Landroid/view/View;Lix;)Lix;

    move-result-object v0

    return-object v0
.end method
