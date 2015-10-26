.class final Lacm;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lacl;


# direct methods
.method constructor <init>(Lacl;)V
    .locals 0

    .prologue
    .line 885
    iput-object p1, p0, Lacm;->a:Lacl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 888
    iget-object v0, p0, Lacm;->a:Lacl;

    iget-object v0, v0, Lacl;->a:Lacb;

    invoke-virtual {v0}, Lacb;->invalidate()V

    .line 889
    return-void
.end method
