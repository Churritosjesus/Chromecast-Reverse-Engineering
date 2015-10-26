.class final Lafg;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Laff;


# direct methods
.method constructor <init>(Laff;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lafg;->a:Laff;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 205
    iget-object v0, p0, Lafg;->a:Laff;

    invoke-static {v0}, Laff;->a(Laff;)V

    .line 206
    return-void
.end method
