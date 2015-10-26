.class final Lbhy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lbhf;


# direct methods
.method constructor <init>(Lbhf;)V
    .locals 0

    .prologue
    .line 1011
    iput-object p1, p0, Lbhy;->a:Lbhf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1015
    iget-object v0, p0, Lbhy;->a:Lbhf;

    invoke-static {v0}, Lbhf;->k(Lbhf;)V

    .line 1016
    return-void
.end method
