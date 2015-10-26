.class final Lw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/String;

.field private synthetic b:I

.field private synthetic c:Lt;


# direct methods
.method constructor <init>(Lt;Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 511
    iput-object p1, p0, Lw;->c:Lt;

    iput-object p2, p0, Lw;->a:Ljava/lang/String;

    iput p3, p0, Lw;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .prologue
    .line 513
    iget-object v0, p0, Lw;->c:Lt;

    iget-object v1, p0, Lw;->c:Lt;

    iget-object v1, v1, Lt;->h:Lm;

    iget-object v1, p0, Lw;->a:Ljava/lang/String;

    const/4 v2, -0x1

    iget v3, p0, Lw;->b:I

    invoke-virtual {v0, v1, v2, v3}, Lt;->a(Ljava/lang/String;II)Z

    .line 514
    return-void
.end method
