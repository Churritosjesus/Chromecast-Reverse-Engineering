.class public final Lasw;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic a:Ljava/lang/CharSequence;

.field private synthetic b:I

.field private synthetic c:I

.field private synthetic d:I

.field private synthetic e:Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;Ljava/lang/CharSequence;III)V
    .locals 0

    .prologue
    .line 47
    iput-object p1, p0, Lasw;->e:Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;

    iput-object p2, p0, Lasw;->a:Ljava/lang/CharSequence;

    iput p3, p0, Lasw;->b:I

    iput p4, p0, Lasw;->c:I

    iput p5, p0, Lasw;->d:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .prologue
    .line 50
    iget-object v0, p0, Lasw;->e:Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;

    iget-object v1, p0, Lasw;->a:Ljava/lang/CharSequence;

    iget v2, p0, Lasw;->b:I

    iget v3, p0, Lasw;->c:I

    iget v4, p0, Lasw;->d:I

    .line 51
    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->a(Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;Ljava/lang/CharSequence;III)V

    .line 52
    return-void
.end method
