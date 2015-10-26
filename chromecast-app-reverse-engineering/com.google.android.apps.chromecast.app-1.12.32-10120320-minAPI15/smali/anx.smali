.class final Lanx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lbdn;


# instance fields
.field private synthetic a:Land;


# direct methods
.method constructor <init>(Land;)V
    .locals 0

    .prologue
    .line 1478
    iput-object p1, p0, Lanx;->a:Land;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/Object;)V
    .locals 3

    .prologue
    .line 1478
    check-cast p1, Lbdj;

    .line 2482
    iget-object v0, p0, Lanx;->a:Land;

    iput-object p1, v0, Land;->m:Lbdj;

    .line 2483
    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v0, p0, Lanx;->a:Land;

    iget-object v0, v0, Land;->m:Lbdj;

    if-nez v0, :cond_0

    .line 2484
    const-string v0, "null"

    :goto_0
    aput-object v0, v1, v2

    .line 2485
    iget-object v0, p0, Lanx;->a:Land;

    invoke-static {v0}, Land;->g(Land;)Laop;

    move-result-object v0

    invoke-interface {v0}, Laop;->a()V

    .line 2486
    iget-object v0, p0, Lanx;->a:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 1478
    return-void

    .line 2484
    :cond_0
    iget-object v0, p0, Lanx;->a:Land;

    iget-object v0, v0, Land;->m:Lbdj;

    invoke-virtual {v0}, Lbdj;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final b_(I)V
    .locals 1

    .prologue
    .line 1491
    iget-object v0, p0, Lanx;->a:Land;

    invoke-static {v0}, Land;->g(Land;)Laop;

    move-result-object v0

    invoke-interface {v0}, Laop;->a()V

    .line 1492
    iget-object v0, p0, Lanx;->a:Land;

    invoke-virtual {v0}, Land;->y()V

    .line 1493
    return-void
.end method
