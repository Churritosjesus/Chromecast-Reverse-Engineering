.class final Lon;
.super Lua;
.source "PG"


# instance fields
.field private synthetic a:Loi;


# direct methods
.method constructor <init>(Loi;)V
    .locals 0

    .prologue
    .line 445
    iput-object p1, p0, Lon;->a:Loi;

    invoke-direct {p0}, Lua;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    .line 448
    iget-object v0, p0, Lon;->a:Loi;

    invoke-static {v0}, Loi;->e(Loi;)Z

    .line 449
    return-void
.end method

.method public final b(Luh;)V
    .locals 1

    .prologue
    .line 458
    iget-object v0, p0, Lon;->a:Loi;

    invoke-static {v0}, Loi;->d(Loi;)Luh;

    move-result-object v0

    if-ne p1, v0, :cond_0

    .line 459
    iget-object v0, p0, Lon;->a:Loi;

    invoke-static {v0}, Loi;->b(Loi;)V

    .line 461
    :cond_0
    return-void
.end method

.method public final c(Ltz;Luh;)V
    .locals 1

    .prologue
    .line 453
    iget-object v0, p0, Lon;->a:Loi;

    invoke-static {v0}, Loi;->e(Loi;)Z

    .line 454
    return-void
.end method
