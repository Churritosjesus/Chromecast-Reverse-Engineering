.class public Lcom/google/android/gms/location/ActivityRecognitionResult;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/internal/safeparcel/SafeParcelable;


# static fields
.field public static final CREATOR:Lcna;


# instance fields
.field public final a:I

.field public b:Ljava/util/List;

.field public c:J

.field public d:J

.field public e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcna;

    invoke-direct {v0}, Lcna;-><init>()V

    sput-object v0, Lcom/google/android/gms/location/ActivityRecognitionResult;->CREATOR:Lcna;

    return-void
.end method

.method public constructor <init>(ILjava/util/List;JJI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->a:I

    iput-object p2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->b:Ljava/util/List;

    iput-wide p3, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->c:J

    iput-wide p5, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->d:J

    iput p7, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->e:I

    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ActivityRecognitionResult [probableActivities="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", timeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->c:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", elapsedRealtimeMillis="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/location/ActivityRecognitionResult;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1}, Lcna;->a(Lcom/google/android/gms/location/ActivityRecognitionResult;Landroid/os/Parcel;)V

    return-void
.end method
