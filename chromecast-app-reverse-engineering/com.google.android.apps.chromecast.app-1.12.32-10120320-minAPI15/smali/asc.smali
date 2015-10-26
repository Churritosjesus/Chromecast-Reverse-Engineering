.class final Lasc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lasb;


# direct methods
.method constructor <init>(Lasb;)V
    .locals 0

    .prologue
    .line 44
    iput-object p1, p0, Lasc;->a:Lasb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 47
    iget-object v0, p0, Lasc;->a:Lasb;

    .line 1020
    invoke-virtual {v0}, Lasb;->b()V

    .line 48
    return-void
.end method
