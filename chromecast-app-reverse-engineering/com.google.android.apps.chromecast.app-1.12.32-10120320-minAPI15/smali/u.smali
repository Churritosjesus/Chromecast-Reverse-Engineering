.class final Lu;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lt;


# direct methods
.method constructor <init>(Lt;)V
    .locals 0

    .prologue
    .line 455
    iput-object p1, p0, Lu;->a:Lt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 458
    iget-object v0, p0, Lu;->a:Lt;

    invoke-virtual {v0}, Lt;->h()Z

    .line 459
    return-void
.end method
