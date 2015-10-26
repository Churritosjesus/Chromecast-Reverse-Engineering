.class final Lyi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lyg;


# direct methods
.method constructor <init>(Lyg;)V
    .locals 0

    .prologue
    .line 1484
    iput-object p1, p0, Lyi;->a:Lyg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1487
    iget-object v0, p0, Lyi;->a:Lyg;

    invoke-static {v0}, Lyg;->b(Lyg;)V

    .line 1488
    return-void
.end method
