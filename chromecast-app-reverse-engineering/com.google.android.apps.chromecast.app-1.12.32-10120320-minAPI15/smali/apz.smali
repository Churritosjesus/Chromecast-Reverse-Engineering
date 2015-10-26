.class final Lapz;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lapu;


# direct methods
.method constructor <init>(Lapu;)V
    .locals 0

    .prologue
    .line 204
    iput-object p1, p0, Lapz;->a:Lapu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lapz;->a:Lapu;

    invoke-static {v0}, Lapu;->d(Lapu;)Laqd;

    move-result-object v0

    .line 1182
    iget-boolean v0, v0, Laqd;->i:Z

    .line 208
    if-nez v0, :cond_0

    .line 209
    iget-object v0, p0, Lapz;->a:Lapu;

    invoke-static {v0}, Lapu;->c(Lapu;)V

    .line 210
    iget-object v0, p0, Lapz;->a:Lapu;

    invoke-static {v0}, Lapu;->e(Lapu;)Lblp;

    .line 212
    :cond_0
    return-void
.end method
