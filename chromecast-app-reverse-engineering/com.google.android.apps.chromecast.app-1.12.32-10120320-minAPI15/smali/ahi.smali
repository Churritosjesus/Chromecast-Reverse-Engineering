.class final Lahi;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lahp;


# direct methods
.method constructor <init>(Lahp;)V
    .locals 0

    .prologue
    .line 820
    iput-object p1, p0, Lahi;->a:Lahp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 823
    iget-object v0, p0, Lahi;->a:Lahp;

    invoke-static {v0}, Lahe;->a(Lahp;)V

    .line 824
    return-void
.end method
