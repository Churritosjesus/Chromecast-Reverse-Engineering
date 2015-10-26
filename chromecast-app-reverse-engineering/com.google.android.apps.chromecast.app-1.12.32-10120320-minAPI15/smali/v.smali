.class final Lv;
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
    .line 495
    iput-object p1, p0, Lv;->a:Lt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 497
    iget-object v0, p0, Lv;->a:Lt;

    iget-object v1, p0, Lv;->a:Lt;

    iget-object v1, v1, Lt;->h:Lm;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Lt;->a(Ljava/lang/String;II)Z

    .line 498
    return-void
.end method
