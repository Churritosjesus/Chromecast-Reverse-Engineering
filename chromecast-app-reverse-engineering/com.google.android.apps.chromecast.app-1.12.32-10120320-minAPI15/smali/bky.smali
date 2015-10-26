.class final Lbky;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field private synthetic a:Ljava/lang/CharSequence;

.field private synthetic b:Lbkv;


# direct methods
.method constructor <init>(Lbkv;Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 545
    iput-object p1, p0, Lbky;->b:Lbkv;

    iput-object p2, p0, Lbky;->a:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .prologue
    .line 548
    iget-object v0, p0, Lbky;->b:Lbkv;

    .line 1493
    iget-object v0, v0, Lbkv;->b:Lblc;

    .line 548
    iget-object v1, p0, Lbky;->b:Lbkv;

    iget-object v2, p0, Lbky;->a:Ljava/lang/CharSequence;

    invoke-interface {v0, v1, v2}, Lblc;->a(Lbkv;Ljava/lang/CharSequence;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
