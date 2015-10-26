.class final Lx;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:I

.field private synthetic b:I

.field private synthetic c:Lt;


# direct methods
.method constructor <init>(Lt;II)V
    .locals 0

    .prologue
    .line 530
    iput-object p1, p0, Lx;->c:Lt;

    iput p2, p0, Lx;->a:I

    iput p3, p0, Lx;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 532
    iget-object v0, p0, Lx;->c:Lt;

    iget-object v1, p0, Lx;->c:Lt;

    iget-object v1, v1, Lt;->h:Lm;

    const/4 v1, 0x0

    iget v2, p0, Lx;->a:I

    iget v3, p0, Lx;->b:I

    invoke-virtual {v0, v1, v2, v3}, Lt;->a(Ljava/lang/String;II)Z

    .line 533
    return-void
.end method
