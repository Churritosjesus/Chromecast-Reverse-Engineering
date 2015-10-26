.class final Lahf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 690
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 693
    invoke-static {}, Lahe;->a()I

    move-result v0

    sget v1, Laho;->b:I

    if-eq v0, v1, :cond_0

    .line 694
    sget-object v0, Lahp;->a:Lahp;

    invoke-static {v0}, Lahe;->a(Lahp;)V

    .line 696
    :cond_0
    return-void
.end method
