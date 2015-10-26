.class final Lyj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lyc;


# direct methods
.method constructor <init>(Lyc;)V
    .locals 0

    .prologue
    .line 1718
    iput-object p1, p0, Lyj;->a:Lyc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 1720
    iget-object v0, p0, Lyj;->a:Lyc;

    invoke-virtual {v0}, Lyc;->d()V

    .line 1721
    return-void
.end method
