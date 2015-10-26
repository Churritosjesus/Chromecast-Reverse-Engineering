.class final Lacf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Lacb;


# direct methods
.method constructor <init>(Lacb;)V
    .locals 0

    .prologue
    .line 230
    iput-object p1, p0, Lacf;->a:Lacb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .prologue
    .line 234
    iget-object v0, p0, Lacf;->a:Lacb;

    invoke-virtual {v0}, Lacb;->c()V

    .line 235
    return-void
.end method
