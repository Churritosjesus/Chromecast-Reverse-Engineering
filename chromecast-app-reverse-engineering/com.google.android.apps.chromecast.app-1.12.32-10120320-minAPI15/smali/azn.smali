.class final Lazn;
.super Ljava/lang/Thread;
.source "PG"


# instance fields
.field private synthetic a:Lazm;


# direct methods
.method constructor <init>(Lazm;)V
    .locals 0

    .prologue
    .line 190
    iput-object p1, p0, Lazn;->a:Lazm;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 193
    iget-object v0, p0, Lazn;->a:Lazm;

    invoke-static {v0}, Lazm;->a(Lazm;)V

    .line 194
    return-void
.end method
